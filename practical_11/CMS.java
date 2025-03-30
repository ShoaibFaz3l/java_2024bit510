mport java.time.Year;

public class CMS {

    static Student[] array = new Student[20];
    static int ITCount = 0, cseCount = 0, eceCount = 0, MechCount = 0, chemCount = 0, textileCount = 0;

    String email, name, regNo, bloodGroup, branch, mode;
    int currentYear, admissionYear;

    void setName(String name) {
        this.name = name;
    }

    void setBranch(String branch) {
        this.branch = branch;
    }

    void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    void setMode(String mode) {
        this.mode = mode;
    }

    void calculateCurrentYear() {
        this.currentYear = (Year.now().getValue() - admissionYear) + 1;
    }

    void generateRegNo() {
        String branchInitial = this.branch.substring(0, 2).toUpperCase();
        int sequenceNumber = switch (branchInitial) {
            case "CS" -> ++cseCount;
            case "EC" -> ++eceCount;
            case "IT" -> ++ITCount;
            case "ME" -> ++MechCount;
            case "CH" -> ++chemCount;
            case "TE" -> ++textileCount;
            default -> 0;
        };

        if (mode.equalsIgnoreCase("DSY")) {
            sequenceNumber += 500;
            this.regNo = admissionYear + "B" + branchInitial + sequenceNumber;
        } else {
            this.regNo = admissionYear + "B" + branchInitial + "0" + sequenceNumber;
        }

        setEmailFromRegNo();
    }

    void setEmailFromRegNo() {
        this.email = regNo + "@sggs.ac.in";
    }

    void setStudentInfo(String info) {
        String[] studentsData = info.split("#");

        for (int i = 0; i < studentsData.length; i++) {
            String[] details = studentsData[i].split(",");
            Student s = new Student();

            for (String detail : details) {
                detail = detail.trim();
                if (detail.startsWith("Name=")) s.setName(detail.substring(5));
                else if (detail.startsWith("Branch=")) s.setBranch(detail.substring(7));
                else if (detail.startsWith("BloodGroup=")) s.setBloodGroup(detail.substring(11));
                else if (detail.startsWith("AdmissionYear=")) s.setAdmissionYear(Integer.parseInt(detail.substring(14)));
                else if (detail.startsWith("Mode=")) s.setMode(detail.substring(5));
            }

            s.generateRegNo();
            s.calculateCurrentYear();
            array[i] = s;
        }
    }

    void displayInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("Name          : " + name);
        System.out.println("Email         : " + email);
        System.out.println("Reg No        : " + regNo);
        System.out.println("Blood Group   : " + bloodGroup);
        System.out.println("Current Year  : " + currentYear);
        System.out.println("Branch        : " + branch);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("Mode          : " + mode);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentInfo(
            "Name=Sohail,Branch=IT,BloodGroup=O+,AdmissionYear=2024,Mode=DSY #" +
            "Name=Shoaib,Branch=CSE,BloodGroup=O+,AdmissionYear=2023,Mode=Regular #" +
            "Name=Pratik,Branch=Mech,BloodGroup=A+,AdmissionYear=2023,Mode=Regular"
        );

        for (Student s : array) {
            if (s != null) {
                s.displayInfo();
            }
        }
    }
}
