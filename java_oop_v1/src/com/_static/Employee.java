package com._static;

public class Employee {

    private int employeeId; // 사원번호
    private String name; // 이름
    private String department; // 부서

    // 생성자
    public Employee(String name) {
        this.name = name;
        // 클래스 변수를 활용해보자.
        // 클래스 이름으로 접근할 수 있다.
        employeeId = Company.empSerialNumber;
        Company.empSerialNumber++;
        //employeeId = 1;
    }

    // getter
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

}


// 배열 : 연관된 데이터를 통으로 관리하기 위한 자료구조이다.
// 배열길이, 인덱스 길이  n, n-1 [] <- 인덱스 연산자
// 배열은 보통 for문과 함께 많이 사용한다.
