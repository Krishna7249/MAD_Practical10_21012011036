package com.krishnajoshi.mad_practical10_21012011036

import java.io.Serializable

class Person(var id:String,
             var name:String,
             var emailId:String,
             var phoneNo:String,
             var address:String,
             var latitude:Double,
             var longitude:Double):Serializable {
}