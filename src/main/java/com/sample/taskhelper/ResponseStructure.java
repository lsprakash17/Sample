package com.sample.taskhelper;

import lombok.Data;

@Data
public class ResponseStructure<T>
{
 int id;
 String msg;
 T data;
}
