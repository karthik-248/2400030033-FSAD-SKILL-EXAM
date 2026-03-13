package com.klef.fsad.exam;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="transport")
public class Transport
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;

@Temporal(TemporalType.DATE)
private Date date;

private String status;

private String type;

private String location;

public Transport() {}

public Transport(String name, Date date, String status, String type, String location)
{
this.name = name;
this.date = date;
this.status = status;
this.type = type;
this.location = location;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Date getDate() {
return date;
}

public void setDate(Date date) {
this.date = date;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getLocation() {
return location;
}

public void setLocation(String location) {
this.location = location;
}

@Override
public String toString() {
return "Transport [id=" + id + ", name=" + name + ", date=" + date +
", status=" + status + ", type=" + type + ", location=" + location + "]";
}

}