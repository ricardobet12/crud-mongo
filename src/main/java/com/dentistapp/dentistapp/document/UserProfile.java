/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentistapp.dentistapp.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author ricardo
 */
@Document(collection = "UserProfile")
@Getter
@Setter
@ToString
public class UserProfile {
    
    private String name;
    private String surname;
    
}
