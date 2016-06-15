package nolan.oop.transmit;

import java.util.ArrayList;
import java.util.List;

import nolan.oop.transmit.entity.StudentEntity;

public class CollectionTransmit {
	
	public static void main(String[] args) {
		List<StudentEntity>  studentList = new ArrayList<StudentEntity>();
		StudentEntity  studentEntity =  new StudentEntity();
		studentEntity.setsName("吴振雪");
		studentEntity.setsNo("01");
		studentEntity.setsClass("html训练班");
		studentList.add(studentEntity);
		List<StudentEntity> resultStudentList = transmitList(studentList);
		System.out.println("resultStudentList====>"+resultStudentList);
		System.out.println("studentList=====>"+studentList);
		System.out.println("studentList.get(0)"+studentList.get(0).getsName());
		System.out.println("resultStudentList.get(0)"+resultStudentList.get(0).getsName());
		
		
		
		CollectionTransmit coll =  new CollectionTransmit();
		List<StudentEntity>  studentList2 = new ArrayList<StudentEntity>();
		coll.transmitListNorResult(studentList2);
		System.out.println("========方法内等号赋值集合======"+studentList2.size());
		
		
		StudentEntity  studentEntity2 =  new StudentEntity();
		coll.transmitListNorResult(studentEntity2);
		System.out.println("========方法内等号赋值对象======"+studentEntity2.getsName());
		
		
	}
	
	
	private  static List<StudentEntity> transmitList(List<StudentEntity> studentList){
		System.out.println("transmitList(studentList)===>"+studentList);
		studentList.get(0).setsName("杨浩");
		return studentList;
	}
	
	
	private void transmitListNorResult(StudentEntity  studentEntity){
		StudentEntity  resultStudentEntity = new StudentEntity();
		resultStudentEntity.setsClass("hahahaa");
		resultStudentEntity.setsName("lalalala");
		studentEntity= resultStudentEntity;
		
	}
	
	private void transmitListNorResult(List<StudentEntity> studentList){
		StudentEntity  studentEntity =  new StudentEntity();
		studentEntity.setsName("kkkkkk");
		studentEntity.setsNo("00000");
		studentEntity.setsClass("java训练班");
		List<StudentEntity> newStudentList = new ArrayList<StudentEntity>();
		newStudentList.add(studentEntity);
		studentList = newStudentList;
	}

}
