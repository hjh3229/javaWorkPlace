package nadocoding.Chap_07;

public class BlackBoxRefurbish {
    // _10
    public String modelName; // 모델명
    String resolution; // 해상도 // default 생략 상태
    private int price; // 가격
    protected String color; // 색상

    // 변수만 만든 상태에서 Code -> Generate -> Getter and Setter -> 대상 지정 하면 getter와 setter를 한꺼번에 자동으로 생성 가능

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
