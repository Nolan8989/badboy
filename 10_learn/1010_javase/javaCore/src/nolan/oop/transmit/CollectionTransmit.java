package nolan.oop.transmit;

import java.util.ArrayList;
import java.util.List;

import nolan.oop.transmit.entity.StudentEntity;

public class CollectionTransmit {
	
	public static void main(String[] args) {
		List<StudentEntity>  studentList = new ArrayList<StudentEntity>();
		StudentEntity  studentEntity =  new StudentEntity();
		studentEntity.setsName("����ѩ");
		studentEntity.setsNo("01");
		studentEntity.setsClass("htmlѵ����");
		studentList.add(studentEntity);
		List<StudentEntity> resultStudentList = transmitList(studentList);
		System.out.println("resultStudentList====>"+resultStudentList);
		System.out.println("studentList=====>"+studentList);
		System.out.println("studentList.get(0)"+studentList.get(0).getsName());
		System.out.println("resultStudentList.get(0)"+resultStudentList.get(0).getsName());
		
		
		
		CollectionTransmit coll =  new CollectionTransmit();
		List<StudentEntity>  studentList2 = new ArrayList<StudentEntity>();
		coll.transmitListNorResult(studentList2);
		System.out.println("========�����ڵȺŸ�ֵ����======"+studentList2.size());
		
		
		StudentEntity  studentEntity2 =  new StudentEntity();
		coll.transmitListNorResult(studentEntity2);
		System.out.println("========�����ڵȺŸ�ֵ����======"+studentEntity2.getsName());
		
		
	}
	
	
	private  static List<StudentEntity> transmitList(List<StudentEntity> studentList){
		System.out.println("transmitList(studentList)===>"+studentList);
		studentList.get(0).setsName("���");
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
		studentEntity.setsClass("javaѵ����");
		List<StudentEntity> newStudentList = new ArrayList<StudentEntity>();
		newStudentList.add(studentEntity);
		studentList = newStudentList;
	}

}
