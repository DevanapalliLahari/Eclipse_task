package com.xworkz.app;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.Method;
import java.net.UnknownServiceException;
import java.nio.BufferUnderflowException;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.time.DateTimeException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.concurrent.RejectedExecutionException;

import javax.management.JMRuntimeException;

import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class Animal extends RuntimeException {

	public static void main(String[] args) {
int index=8;
if(index==0)
{
	throw new RuntimeException("simple problem");
}
if(index==1)
{
	throw new IndexOutOfBoundsException("the is wrong");
}
if(index==2)
{
	throw new NullPointerException("The string is empty");
}
if(index==3)
{
	throw new ArrayStoreException("the array is ");
}
if(index==4)
{
	throw new ArithmeticException("the Arthematic is ");
}
if(index==5)
{
	throw new  NegativeArraySizeException("the negative index");
}
if(index==6)
{
	throw new  SecurityException("security problem");
}
if(index==7)
{
	throw new  RejectedExecutionException("reject  the  code");
}
if(index==8)
{
	Method element = null ;
	throw new  AnnotationTypeMismatchException(element, "Annotation problem");
}
if(index==9)
{
	throw new  ClosedWatchServiceException();
}
if(index==10)
{
	throw new  IllegalMonitorStateException("illegal exception");
}
if(index==11)
{
	throw new  BufferUnderflowException();
}
if(index==12)
{
	throw new  DateTimeException("time and date error");
}
if(index==13)
{
	throw new MissingResourceException("time", "reasource", "type");
}
if(index==14)
{
	throw new EventException((short) 200, "name");
}
if(index==15)
{
	throw new JMRuntimeException("runtime error");
}
if(index==16)
{
	throw new FileSystemNotFoundException("system problem");
}
if(index==17)
{
	throw new ProviderNotFoundException("not found problem");
}
if(index==18)
{
	throw new LSException((short) 12, "not found problem");
}
if(index==19)
{
	throw new WrongMethodTypeException("method is wrong");
}
	}
	
}
