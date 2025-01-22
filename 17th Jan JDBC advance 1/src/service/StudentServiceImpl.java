package service;

import daofactory.StudentDaoFactory;
import dto.Student;
import persistence.IStudentDao;
import servicefactory.StudentServiceFactory;

public class StudentServiceImpl implements IStudentService{

    IStudentDao studentDao;

    @Override
    public String addStudent(String sname, Integer sage, String saddress) {
        studentDao = StudentDaoFactory.getStudentDao();
        return studentDao.addStudent(sname, sage, saddress);
    }

    @Override
    public Student searchStudent(Integer sid) {
        return null;
    }

    @Override
    public String updateStudent(Integer sid, String sname, Integer sage, String saddress) {
        return "";
    }

    @Override
    public String deleteStudent(Integer sid) {
        return "";
    }
}
