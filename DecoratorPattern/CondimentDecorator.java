package DecoratorPattern;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription(); //모든 첨가물 데코레이터에서 이를 다시 구현하게 하기 위함
}
