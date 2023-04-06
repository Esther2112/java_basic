package day09.quiz;

public class Galaxy extends SmartPhone implements Touchable, Pencil {
    public Galaxy(String model) {
        super(model);
    }
    @Override
    public String information() {
        return String.format("%s는 삼성에서 만들어졌고 제원은 다음과 같다.\n" +
                "%s\n%s\n%s\n%s\n%s\n블루투스 펜 탑재 여부: %s",
                this.getModel(),makeCall(), takeCall(), takePic(), charge(), touchDisplay(), bluetoothPen());
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선 충전";
    }

    @Override
    public String takePic() {
        return "1300만 듀얼카메라";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름";
    }

    @Override
    public String touchDisplay() {
        return "정전식, 와콤펜 지원";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }
}
