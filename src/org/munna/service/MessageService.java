package org.munna.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.munna.database.DatabaseClass;
import org.munna.model.Message;

public class MessageService {

	private static Map<Long,Message> messages = DatabaseClass.getMessages();
	
	@SuppressWarnings("deprecation")
	public MessageService() {
		messages.put(1l, new Message(1l,"hai","munna"));
		messages.put(2l, new Message(2l,"how are you","munna"));
		
		
	}
	//to get all the messages 
	public List<Message> getMessages()
	{
		return  new ArrayList<Message>(messages.values());
	}
	
	//to get a particular message
	public Message getMessage(long id)
	{
		return messages.get(id);
	}
	
	//adding one message
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	//updating Message
	public Message updateMessage(Message message)
	{
		if(message.getId() <= 0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	//Removing a Message
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
	public List<Message> getMessagesByYear(int year) {
		List<Message> list =new ArrayList<Message>();
		Calendar cl=Calendar.getInstance();
		for(Message message :messages.values()){
			cl.setTime(message.getCreated());
			if(cl.get(Calendar.YEAR) == year)
			{
				list.add(message);
			}
		}
		return list;
		
	}
	public List<Message> getMessagesByPagination(int start,int pages) {
		
		
		List<Message> list =new ArrayList<Message>(messages.values());
		if(start+pages > list.size()){
			return new ArrayList<Message>();
		}
		return list.subList(start, pages);
	}
}
