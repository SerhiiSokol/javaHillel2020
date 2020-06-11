import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Agent {
    private static final String QUEUE_NAME = "MYQueue";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        while (true) {
            int randomNum = (int) (Math.random() *3);
            String message = String.valueOf(randomNum);
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println("Загадал число ->>> " + message);
        }
    }
}

