package factory;

public class DanceRobotBuilder implements IBuildRobot {
	Robot robot;

	public DanceRobotBuilder() {
		robot = new Robot();
	}

	@Override
	public void buildHead() {
		robot.setHead("д���е�����");
	}

	@Override
	public void buildBody() {
		robot.setBody("�ѺϽ�����");
	}

	@Override
	public void buildHand() {
		robot.setHand("�ѺϽ���");
	}

	@Override
	public void buildFoot() {
		robot.setFoot("�ѺϽ��");
	}

	@Override
	public Robot createRobot() {
		return robot;
	}

}
