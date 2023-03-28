/**
 * 
 */
package org.topicquests.newasr;

import java.util.Map;

import org.topicquests.newasr.api.IKafkaDispatcher;
import org.topicquests.newasr.impl.SentenceListener;
import org.topicquests.newasr.kafka.KafkaHandler;
import org.topicquests.support.RootEnvironment;
import org.topicquests.support.config.Configurator;

/**
 * @author jackpark
 *
 */
public class ASRExpectationEnvironment extends RootEnvironment {
	private Map<String,Object>kafkaProps;
	private IKafkaDispatcher eventListener;
	private KafkaHandler eventConsumer;

	/**
	 * 
	 */
	public ASRExpectationEnvironment() {
		super("asr-expectation-config.xml", "logger.properties");
		kafkaProps = Configurator.getProperties("kafka-topics.xml");
		eventListener = new SentenceListener(this);

	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
