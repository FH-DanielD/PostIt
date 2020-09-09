package com.SuperGlue.PostIt.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * Message-model used to generate and save messages in the database
 * @author Daniel Dornhof
 *
 */
@Entity 												//Declares this model to be a database-entity
@Table(name="Messages") 								//Saves in the messages table in the database
public class PostItMessage {
	@Id													//Declares the field to be the identifier of the entity.
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//Generates this field when inserting it into the database - incremental
	private Integer id;									//Message-id
	
	@NotNull											//This field cant be null
	@Column(columnDefinition = "text")					//Turn column type to "text" for large strings
	private String name;								//Entered name of the sender of the message
	
	@NotNull											//This field cant be null
	@Column(columnDefinition = "text")					//Turn column type to "text" for large strings
	private String message;								//Entered message
	
	
	/**
	 * Constructor used for the persistence framework.
	 * Also used to initialize empty form-fields in the view
	 */
	public PostItMessage() {}							
	
	/**
	 * Constructor for a message object
	 * @param name Name of the sender
	 * @param message message that has been send
	 */
	public PostItMessage(String name, String message) {
		this.name = name;
		this.message = message;
	}
	
	/**
	 * Returns the id of the object
	 * @return id of the object
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * Returns the name of the object
	 * @return name of the object
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the object
	 * @param name new name for the object
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the message of the object
	 * @return the message of the object
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets the message of the object
	 * @param message new message for the object
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * Formats the message and returns it as a string
	 */
	@Override
	public String toString() {
		return name + "> " + message;
	}
}
