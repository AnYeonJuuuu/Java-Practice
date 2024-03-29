package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import VoBox.VoBox;
import accom.AccDto;
import accom.AccService;
import car.CarService;
import car.CarVo;
import car.ReserveVo;
import flight3.Flight_Service;
import flight3.Flight_Vo;
import flight3.Flight_Vo_MyFlight;
import gui.dialog.AccomSearch;
import gui.dialog.CarSearch;
import gui.dialog.Card;
import gui.dialog.Cash;
import gui.dialog.FlightSearch;
import gui.dialog.PopUpDialog;
import gui.dialog.TextFieldDialog;
import gui.dialog.YesOrNo;
import gui.panel.AccDetail;
import gui.panel.CarDetail;
import gui.panel.FaveratePanel;
import gui.panel.FindIdPanel;
import gui.panel.FindPwdPanel;
import gui.panel.FlightDetail;
import gui.panel.InforActiv;
import gui.panel.InforBorad;
import gui.panel.InforRestar;
import gui.panel.InforTrip;
import gui.panel.JoinPanel;
import gui.panel.ListQnaPanel;
import gui.panel.LoginPanel;
import gui.panel.MainPanel;
import gui.panel.MyPagePanel;
import gui.panel.PayInforPanel;
import gui.panel.PointPanel;
import gui.panel.Q1Panel;
import gui.panel.Q2Panel;
import gui.panel.Q3Panel;
import gui.panel.Q4Panel;
import gui.panel.Q5Panel;
import gui.panel.ReservInforPanel;
import gui.panel.ReservedAccomPanel;
import gui.panel.ReservedCar2Panel;
import gui.panel.ReservedCarPanel;
import gui.panel.ReservedFlightPanel;
import gui.panel.ReservedPanel;
import gui.panel.ServicePanel;
import gui.panel.SugTripPanel;
import gui.panel.UpdateMemberPanel;
import gui.panel.ViewQna;
import gui.panel.WriteQna;
import main.Main;
import member.MemberService;
import member.MemberVo;
import payment.PayService;
import payment.PayVo;
import qna.QnaService;
import qna.QnaVo;
import survey.SurveyService;
import survey.SurveyVo;
import travel.TravelDao;
import travel.TravelVo;

public class GUI {

	public static JFrame frame;
	private String where = "";
	public static String where2 = "";
	public static ViewQna viewQna;
	public static CarDetail carDetail;
	public static AccDetail accDetail;
	public static FlightDetail flightDetail;
	public static InforBorad inforborad;
	private VoBox voBox = new VoBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("JEJUDO JOAH");
		frame.setIconImage(new ImageIcon(".\\.\\image\\icon.png").getImage());

		LoginPanel loginPanel = new LoginPanel();
		FaveratePanel faveratePanel = new FaveratePanel();
		MainPanel mainPanel = new MainPanel();
		JoinPanel joinPanel = new JoinPanel();
		FindIdPanel findIdPanel = new FindIdPanel();
		FindPwdPanel findPwdPanel = new FindPwdPanel();
		ReservedPanel reservedPanel = new ReservedPanel();
		ReservedFlightPanel reservedFlightPanel = new ReservedFlightPanel();
		ReservedAccomPanel reservedAccomPanel = new ReservedAccomPanel();
		ReservedCarPanel reservedCarPanel = new ReservedCarPanel();
		ReservedCar2Panel reservedCar2Panel = new ReservedCar2Panel();
		PayInforPanel payInforPanel = new PayInforPanel();
		ReservInforPanel reservInforPanel = new ReservInforPanel();
		SugTripPanel sugTripPanel = new SugTripPanel();
		MyPagePanel myPagePanel = new MyPagePanel();
		ListQnaPanel listQnaPanel = new ListQnaPanel();
		viewQna = new ViewQna();
		WriteQna writeQna = new WriteQna();
		ServicePanel servicePanel = new ServicePanel();
		UpdateMemberPanel updateMemberPanel = new UpdateMemberPanel();
		PointPanel pointPanel = new PointPanel();
		carDetail = new CarDetail();
		InforActiv inforActiv = new InforActiv();
		InforTrip inforTrip = new InforTrip();
		InforRestar inforRestar = new InforRestar();
		inforborad = new InforBorad();
		accDetail = new AccDetail();
		flightDetail = new FlightDetail();
		Q1Panel q1 = new Q1Panel();
		Q2Panel q2 = new Q2Panel();
		Q3Panel q3 = new Q3Panel();
		Q4Panel q4 = new Q4Panel();
		Q5Panel q5 = new Q5Panel();

		MemberService ms = new MemberService();
		QnaService qs = new QnaService();
		SurveyService ss = new SurveyService();
		CarService cs = new CarService();
		AccService as = new AccService();
		PayService ps = new PayService();
		Flight_Service fs = new Flight_Service();
		
		/** 자주묻는질문1 **/
		frame.getContentPane().add(q1);
		q1.setVisible(false);
		
		q1.getBtnNewButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				q1.setVisible(false);
				reservInforPanel.getUpdateBtn().setVisible(true);
				reservInforPanel.getDeleteBtn().setVisible(true);
				reservInforPanel.getBackBtn().setVisible(true);
				reservInforPanel.getNextBtn().setVisible(false);
				reservInforPanel.setVisible(true);
			}
		});
		
		// 홈
		q1.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q1.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		q1.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q1.setVisible(false);
				servicePanel.setVisible(true);
			}
		});
		
		/** 자주묻는질문2 **/
		frame.getContentPane().add(q2);
		q2.setVisible(false);
		
		// 홈
		q2.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q2.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		q2.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q2.setVisible(false);
				servicePanel.setVisible(true);
			}
		});
		
		/** 자주묻는질문3 **/
		frame.getContentPane().add(q3);
		q3.setVisible(false);
		
		// 홈
		q3.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q3.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		q3.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q3.setVisible(false);
				servicePanel.setVisible(true);
			}
		});
		
		/** 자주묻는질문4 **/
		frame.getContentPane().add(q4);
		q4.setVisible(false);
		
		// 홈
		q4.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q4.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		q4.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q4.setVisible(false);
				servicePanel.setVisible(true);
			}
		});
		
		/** 자주묻는질문5 **/
		frame.getContentPane().add(q5);
		q5.setVisible(false);
		
		// 홈
		q5.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q5.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		q5.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q5.setVisible(false);
				servicePanel.setVisible(true);
			}
		});
		
		/** 비행기정보 **/
		frame.getContentPane().add(flightDetail);
		flightDetail.setVisible(false);
		
		flightDetail.getDeleteBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				YesOrNo d = new YesOrNo(frame, "예약취소", "함께 예약한 정보 모두 취소됩니다.");
				if(d.run()==1) {
					PayVo voi = new PayVo();
					voi.setFlightNo(flightDetail.getNo());
					
					PayVo vou = new PayService().cancelCall(voi);
					if(vou!=null) {
						boolean isFinish = new PayService().cancelUp(vou);
						
						if(isFinish) {
							PopUpDialog dialog2 = new PopUpDialog(frame, "예약취소", "예약 취소되었습니다.");
							dialog2.run();
							flightDetail.setVisible(false);
							myPagePanel.setVisible(true);
						}
					}
				}
			}
		});
		
		// 홈
		flightDetail.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				flightDetail.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		flightDetail.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				flightDetail.setVisible(false);
				reservInforPanel.setVisible(true);
			}
		});

		/** 숙소정보 **/
		frame.getContentPane().add(accDetail);
		accDetail.setVisible(false);
		
		accDetail.getDeleteBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				YesOrNo d = new YesOrNo(frame, "예약취소", "함께 예약한 정보 모두 취소됩니다.");
				if(d.run()==1) {
					PayVo voi = new PayVo();
					voi.setAccomNo(accDetail.getNo());
					
					PayVo vou = new PayService().cancelCall(voi);
					if(vou!=null) {
						boolean isFinish = new PayService().cancelUp(vou);
						
						if(isFinish) {
							PopUpDialog dialog2 = new PopUpDialog(frame, "예약취소", "예약 취소되었습니다.");
							dialog2.run();
							accDetail.setVisible(false);
							myPagePanel.setVisible(true);
							System.out.println("11");
						}
					}
					System.out.println("22");
				}
			}
		});

		// 홈
		accDetail.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				accDetail.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		accDetail.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				accDetail.setVisible(false);
				reservInforPanel.setVisible(true);
			}
		});

		/** 여행게시판 **/
		frame.getContentPane().add(inforborad);
		inforborad.setVisible(false);

		// 홈
		inforborad.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inforborad.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		inforborad.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inforborad.setVisible(false);
				switch (where2) {
				case "inforTrip":
					inforTrip.setVisible(true);
					break;
				case "inforRestar":
					inforRestar.setVisible(true);
					break;
				case "inforActiv":
					inforActiv.setVisible(true);
					break;
				case "SugTripPanel":
					sugTripPanel.setVisible(true);
					break;
				}
			}
		});

		/** 회원정보수정 **/
		frame.getContentPane().add(updateMemberPanel);
		updateMemberPanel.setVisible(false);

		updateMemberPanel.getCheckPwdBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (ms.checkPwd(updateMemberPanel.getPwd())) {
					TextFieldDialog dialog = new TextFieldDialog(frame, "비밀번호 확인", "한번 더 입력해주세요");

					if (updateMemberPanel.getPwd().equals(dialog.run())) {
						PopUpDialog dialog2 = new PopUpDialog(frame, "비밀번호 확인", "확인되었습니다.");
						dialog2.run();
						updateMemberPanel.getPwdField().setEnabled(false);
						updateMemberPanel.getCheckPwdBtn().setSelected(true);
					} else {
						PopUpDialog dialog2 = new PopUpDialog(frame, "비밀번호 확인", "비밀번호가 동일하지 않습니다.");
						dialog2.run();
						updateMemberPanel.getCheckPwdBtn().setSelected(false);
					}

				} else {
					PopUpDialog dialog2 = new PopUpDialog(frame, "비밀번호 확인", "비밀번호는 4자리 이상입니다.");
					dialog2.run();
					updateMemberPanel.getCheckPwdBtn().setSelected(false);
				}
			}
		});

		// 홈
		updateMemberPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateMemberPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		updateMemberPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateMemberPanel.setVisible(false);
				myPagePanel.setVisible(true);
			}
		});

		// 회원정보수정
		updateMemberPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (updateMemberPanel.getCheckPwdBtn().isSelected()) {
					MemberVo vo = new MemberVo();
					vo.setEmail(updateMemberPanel.getEmail());
					vo.setMemberNick(updateMemberPanel.getNick());
					vo.setPhone(updateMemberPanel.getPhone());
					vo.setPwd(updateMemberPanel.getPwd());

					if (ms.update(vo)) {
						PopUpDialog dialog = new PopUpDialog(frame, "회원정보수정", "수정이 완료되었습니다.");
						dialog.run();
						updateMemberPanel.setVisible(false);
						myPagePanel.setVisible(true);
						return;
					}
				}
				PopUpDialog dialog = new PopUpDialog(frame, "회원정보수정", "내용을 확인해 주시기 바랍니다.");
				dialog.run();
			}
		});

		/** 포인트확인 **/
		frame.getContentPane().add(pointPanel);
		pointPanel.setVisible(false);

		// 홈
		pointPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pointPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		pointPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pointPanel.setVisible(false);
				myPagePanel.setVisible(true);
			}
		});

		/** 마이페이지 **/
		frame.getContentPane().add(myPagePanel);
		myPagePanel.setVisible(false);

		// 홈
		myPagePanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPagePanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		myPagePanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPagePanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 회원정보수정
		myPagePanel.getMemberUpdateBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MemberVo vo = ms.search();
				if (vo != null) {
					TextFieldDialog d2 = new TextFieldDialog(frame, "회원정보수정", "비밀번호를 입력해 주십시오");
					if(ms.pwdCheck(d2.run())) {
						myPagePanel.setVisible(false);
						updateMemberPanel.setId(vo.getId());
						updateMemberPanel.setPwd(vo.getPwd());
						updateMemberPanel.setName(vo.getMemberName());
						updateMemberPanel.setNick(vo.getMemberNick());
						updateMemberPanel.setPhone(vo.getPhone());
						updateMemberPanel.setEmail(vo.getEmail());
						updateMemberPanel.setVisible(true);
						updateMemberPanel.getPwdField().setEnabled(true);
					}else {
						PopUpDialog dialog = new PopUpDialog(frame, "회원정보수정", "비밀번호가 잘못되었습니다");
						dialog.run();
					}
				}

			}
		});
		// 추천여행지
		myPagePanel.getSuggestionBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(sugTripPanel.set()) {
					myPagePanel.setVisible(false);
					sugTripPanel.setVisible(true);
					sugTripPanel.getNextBtn().setVisible(false);
					where = "myPage";
					return;
				}
				PopUpDialog dialog = new PopUpDialog(frame, "추천여행지", "설문조사를 실시해 주세요");
				dialog.run();
			}
		});

		// 문의확인
		myPagePanel.getInquiryBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPagePanel.setVisible(false);
				listQnaPanel.setList(qs.myQnaList());
				listQnaPanel.setVisible(true);
			}
		});

		// 포인트확인
		myPagePanel.getPointBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				List<PayVo> list = ps.pointAddList(Main.loginNo);
				if (list != null) {
					myPagePanel.setVisible(false);
					pointPanel.setList(list);
					pointPanel.setPoint(Integer.toString(ms.hasPoint()));
					pointPanel.setVisible(true);
				}
			}
		});

		// 예약관리
		myPagePanel.getReservationBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPagePanel.setVisible(false);

				List<ReserveVo> list = cs.reserveInquiry(Main.loginNo);
				List<AccDto> list2 = as.accReservCheck();
				List<Flight_Vo_MyFlight> list3 = fs.search2();

				if (list != null && list2 != null && list3 != null) {
					reservInforPanel.setCarList(list);
					reservInforPanel.setAccList(list2);
					reservInforPanel.setFlightList(list3);

				}
				reservInforPanel.getUpdateBtn().setVisible(true);
				reservInforPanel.getDeleteBtn().setVisible(true);
				reservInforPanel.getBackBtn().setVisible(true);
				reservInforPanel.getNextBtn().setVisible(false);
				reservInforPanel.setVisible(true);
			}
		});

		// 회원탈퇴
		myPagePanel.getQuit().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				YesOrNo d = new YesOrNo(frame, "회원탈퇴", "정말로 탈퇴하시겠습니까?ㅜㅠ");
				if(d.run()==1) {
					TextFieldDialog d2 = new TextFieldDialog(frame, "회원탈퇴", "비밀번호를 입력해 주십시오");
					if(ms.pwdCheck(d2.run())) {
						myPagePanel.setVisible(false);
						ms.quit();
						Main.loginNo = 0;
						loginPanel.setVisible(true);
					}else {
						PopUpDialog dialog = new PopUpDialog(frame, "회원탈퇴", "비밀번호가 잘못되었습니다");
						dialog.run();
					}
				}
			}
		});

		/** 문의내역확인 **/
		frame.getContentPane().add(viewQna);
		viewQna.setVisible(false);

		// 뒤로가기
		viewQna.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewQna.setVisible(false);
				listQnaPanel.setVisible(true);
			}
		});

		// 홈
		viewQna.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewQna.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		viewQna.getUpdateBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewQna.setVisible(false);
				where = "viewQna";
				writeQna.setTextField(viewQna.getqTitle());
				writeQna.setTextArea(viewQna.getqContent());
				writeQna.setNo(viewQna.getNo());
				writeQna.setVisible(true);
			}
		});
		viewQna.getDeleteBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewQna.setVisible(false);
				qs.deleteQ(viewQna.getNo());
				listQnaPanel.setList(qs.myQnaList());
				listQnaPanel.setVisible(true);

			}
		});

		/** 문의게시판 **/
		frame.getContentPane().add(listQnaPanel);
		listQnaPanel.setVisible(false);

		// 뒤로가기
		listQnaPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listQnaPanel.setVisible(false);
				myPagePanel.setVisible(true);
			}
		});

		// 홈
		listQnaPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listQnaPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 글쓰기
		listQnaPanel.getWriteBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listQnaPanel.setVisible(false);
				writeQna.reset();
				writeQna.setVisible(true);
				where = "listQna";
			}
		});

		/** 문의작성 **/
		frame.getContentPane().add(writeQna);
		writeQna.setVisible(false);

		// 홈
		writeQna.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				writeQna.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		// 뒤로가기
		writeQna.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				writeQna.setVisible(false);
				if (where.equals("service")) {
					servicePanel.setVisible(true);
				} else {
					listQnaPanel.setVisible(true);
				}

			}
		});

		writeQna.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				QnaVo vo = new QnaVo();
				vo.setQuestionNo(writeQna.getNo());
				vo.setQuestionTitle(writeQna.getTextField());
				vo.setqContent(writeQna.getTextArea());

				if (where.equals("viewQna")) {
					if (qs.updateQ(vo)) {
						writeQna.setVisible(false);
						PopUpDialog dialog = new PopUpDialog(frame, "문의작성", "수정이 완료되었습니다!");
						dialog.run();
						viewQna.set(qs.search(vo.getQuestionNo()));
						viewQna.setVisible(true);
					} else {
						PopUpDialog dialog = new PopUpDialog(frame, "문의작성", "수정실패! 내용을 확인해 주세요");
						dialog.run();
					}
				} else {
					if (qs.writeQna(vo)) {
						writeQna.setVisible(false);

						PopUpDialog dialog = new PopUpDialog(frame, "문의작성", "작성이 완료되었습니다!");
						dialog.run();
						if (where.equals("service")) {
							servicePanel.setVisible(true);
						} else {
							listQnaPanel.setList(qs.myQnaList());
							listQnaPanel.setVisible(true);
						}
					} else {
						PopUpDialog dialog = new PopUpDialog(frame, "문의작성", "작성실패! 내용을 확인해 주세요");
						dialog.run();
					}
				}
			}
		});

		/** 고객센터 **/
		frame.getContentPane().add(servicePanel);
		servicePanel.setVisible(false);
		
		servicePanel.getQ1().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				servicePanel.setVisible(false);
				q1.setVisible(true);
				
			}
		});
		
		servicePanel.getQ2().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				servicePanel.setVisible(false);
				q2.setVisible(true);
				
			}
		});
		
		servicePanel.getQ3().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				servicePanel.setVisible(false);
				q3.setVisible(true);
				
			}
		});
		
		servicePanel.getQ4().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				servicePanel.setVisible(false);
				q4.setVisible(true);
				
			}
		});
		
		servicePanel.getQ5().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				servicePanel.setVisible(false);
				q5.setVisible(true);
				
			}
		});

		// 홈
		servicePanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				servicePanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		servicePanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				servicePanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 글쓰기
		servicePanel.getWriteBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				servicePanel.setVisible(false);
				writeQna.reset();
				writeQna.setVisible(true);
				where = "service";
			}
		});

		/** 추천관광지 **/
		frame.getContentPane().add(sugTripPanel);
		sugTripPanel.setVisible(false);

		// 홈
		sugTripPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sugTripPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		sugTripPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sugTripPanel.setVisible(false);
				if (where.equals("myPage")) {
					myPagePanel.setVisible(true);
				} else {
					reservInforPanel.setVisible(true);
				}

			}
		});
		// 다음
		sugTripPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sugTripPanel.setVisible(false);
				mainPanel.setVisible(true);
				// 결제 완료!
			}
		});
		/** 자동차 디테일 **/
		frame.getContentPane().add(carDetail);
		carDetail.setVisible(false);
		
		carDetail.getDeleteBtn().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				YesOrNo d = new YesOrNo(frame, "예약취소", "함께 예약한 정보 모두 취소됩니다.");
				if(d.run()==1) {
					PayVo voi = new PayVo();
					voi.setCarNo(carDetail.getNo());
					
					PayVo vou = new PayService().cancelCall(voi);
					if(vou!=null) {
						boolean isFinish = new PayService().cancelUp(vou);
						
						if(isFinish) {
							PopUpDialog dialog2 = new PopUpDialog(frame, "예약취소", "예약 취소되었습니다.");
							dialog2.run();
							carDetail.setVisible(false);
							myPagePanel.setVisible(true);
						}
					}
				}
			}
		});

		// 뒤로가기
		carDetail.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				carDetail.setVisible(false);
				reservInforPanel.setVisible(true);
			}
		});

		// 홈
		carDetail.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				carDetail.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		/** 예약정보 **/
		frame.getContentPane().add(reservInforPanel);
		reservInforPanel.setVisible(false);
		
		// 홈
		reservInforPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservInforPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		reservInforPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservInforPanel.setVisible(false);
				myPagePanel.setVisible(true);
			}
		});
		// 다음
		reservInforPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservInforPanel.setVisible(false);
				// 테이블 데이터 셋
				sugTripPanel.set();
				sugTripPanel.getNextBtn().setVisible(true);
				sugTripPanel.setVisible(true);
				where = "reservInfor";
			}
		});

		/** 결제정보 **/
		frame.getContentPane().add(payInforPanel);
		payInforPanel.setVisible(false);

		// 홈
		payInforPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				payInforPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		payInforPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				payInforPanel.setVisible(false);
				if(where.equals("reservedCar")) {
					reservedCarPanel.setVisible(true);
				}
				reservedCar2Panel.setVisible(true);
			}
		});
		// 다음
		payInforPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (payInforPanel.getCardorCash().equals("1")) {
					Card dialog = new Card(frame, "카드결제", "");
					dialog.run();
				} else {
					Cash dialog = new Cash(frame, "계좌이체", "");
					dialog.run();
				}

				PayVo vo = payInforPanel.getVo();

				vo.setPointUsed(payInforPanel.getUsePoint());
				vo.setCutPrice(payInforPanel.getSumPrice());
				vo.setMypoint(payInforPanel.getSumPrice() / 20);
				vo.setPayMethod(Integer.parseInt(payInforPanel.getCardorCash()));
				
				if(voBox.getRvo()==null) {
					
				}else {
					cs.carReserve(voBox.getRvo());
				}

				/* 각 예약 인설트 후 */
				if (as.accReserve(voBox.getAvo()) > 0 && fs.realReservation(voBox.getFvo()) > 0) {
					
					System.out.println("test인설트정상적");
					PayVo pvo = ps.getNo(Main.loginNo, "N");
					if (pvo != null) {
						System.out.println("test넘버조회 성공");
						vo.setAccomNo(pvo.getAccomNo());
						vo.setCarNo(pvo.getCarNo());
						vo.setFlightNo(pvo.getFlightNo());
						System.out.println(vo);
						int point = ps.userInfo(Main.loginNo).getPoint() - payInforPanel.getUsePoint()
								+ (payInforPanel.getSumPrice() / 20);
						
						if (ps.payEnd(Main.loginNo, point, vo)) {
							System.out.println("test결제정보 인설트 성공");
							payInforPanel.setVisible(false);

							List<ReserveVo> list = cs.reserveInquiry(Main.loginNo);
							List<AccDto> list2 = as.accReservCheck();
							List<Flight_Vo_MyFlight> list3 = fs.search2();
							
							if (list != null && list2 != null && list3 !=null) {
								System.out.println("test리스트 불러오기 성공");
								reservInforPanel.setCarList(list);
								reservInforPanel.setAccList(list2);
								reservInforPanel.setFlightList(list3);
								
								reservInforPanel.getUpdateBtn().setVisible(false);
								reservInforPanel.getDeleteBtn().setVisible(false);
								reservInforPanel.getBackBtn().setVisible(false);
								reservInforPanel.getNextBtn().setVisible(true);
								reservInforPanel.setVisible(true);
							}
						}
					}
				}
				// 결제 완료!
			}
		});

		/** 예약페이지 랜트카2 **/
		frame.getContentPane().add(reservedCar2Panel);
		reservedCar2Panel.setVisible(false);

		// 홈
		reservedCar2Panel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedCar2Panel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		reservedCar2Panel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedCar2Panel.setVisible(false);
				reservedCarPanel.setVisible(true);
			}
		});
		// 다음
		reservedCar2Panel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ReserveVo vo = reservedCar2Panel.getVo();
				vo.setInsurance(reservedCar2Panel.getInsurance());

				voBox.setC(vo);

//				if(cs.carReserve(vo)>0) {

				PayVo pvo = ps.reservation(Main.loginNo, voBox);

				if (pvo != null) {
					reservedCar2Panel.setVisible(false);

					payInforPanel.setFlightPrice(pvo.getFlightGoPay() + pvo.getFlightComePay());
					payInforPanel.setAccomPrice(pvo.getAccomPay());
					payInforPanel.setCarPrice(pvo.getCarPay());
					payInforPanel.setHavePoint(ps.userInfo(Main.loginNo).getPoint());
//						payInforPanel.setSumPrice(pvo.getTotalPay());
					payInforPanel.setVo(pvo);
					payInforPanel.reset();
					payInforPanel.setVisible(true);
//					}

				} else {
					PopUpDialog dialog = new PopUpDialog(frame, "예약", "예약실패! 내용을 확인해 주세요");
					dialog.run();
				}
			}
		});

		/** 예약페이지 랜트카 **/
		frame.getContentPane().add(reservedCarPanel);
		reservedCarPanel.setVisible(false);

		// 홈
		reservedCarPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedCarPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		reservedCarPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedCarPanel.setVisible(false);
				reservedAccomPanel.setVisible(true);
			}
		});
		// 다음
		reservedCarPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(reservedCarPanel.getNotReserve().isSelected()){
					
					PayVo pvo = ps.reservation(Main.loginNo, voBox);

					if (pvo != null) {
						voBox.setRvo(null);
						reservedCarPanel.setVisible(false);
						where = "reservedCar";
						payInforPanel.setFlightPrice(pvo.getFlightGoPay() + pvo.getFlightComePay());
						payInforPanel.setAccomPrice(pvo.getAccomPay());
						payInforPanel.setCarPrice(pvo.getCarPay());
						payInforPanel.setHavePoint(ps.userInfo(Main.loginNo).getPoint());
//							payInforPanel.setSumPrice(pvo.getTotalPay());
						payInforPanel.setVo(pvo);
						payInforPanel.reset();
						payInforPanel.setVisible(true);
						return;
//						}

					} else {
						PopUpDialog dialog = new PopUpDialog(frame, "예약", "예약실패! 내용을 확인해 주세요");
						dialog.run();
					}
				}
				
				CarVo vo = new CarVo();
				vo.setRentalDate(reservedCarPanel.getGoDay());
				vo.setReturnDate(reservedCarPanel.getBackDay());
				vo.setCarPerson(Integer.toString(reservedCarPanel.getContPerson()));
				vo.setCarSize(reservedCarPanel.getCarSize());

//				voBox.setC(vo);

				List<CarVo> list = cs.carInquiry(vo);
				if (list != null) {
					CarSearch dialog = new CarSearch(frame, "자동차 조회");
					dialog.set(list);
					int no = dialog.run();
					if (no > 0) {
						ReserveVo rv = new ReserveVo();
						rv.setRentalNo(no);
						rv.setRentalDate(vo.getRentalDate());
						rv.setReturnDate(vo.getReturnDate());
						rv.setMemberNo(Main.loginNo);
						rv.setDayPrice(dialog.getPrice());

						reservedCarPanel.setVisible(false);
						reservedCar2Panel.reset();
						reservedCar2Panel.setVo(rv);
						reservedCar2Panel.setVisible(true);
					}
				} else {
					PopUpDialog dialog = new PopUpDialog(frame, "조회", "조회 실패! 내용을 확인해 주세요");
					dialog.run();
				}
			}
		});

		/** 예약페이지 숙박 **/
		frame.getContentPane().add(reservedAccomPanel);
		reservedAccomPanel.setVisible(false);

		// 홈
		reservedAccomPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedAccomPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 뒤로가기
		reservedAccomPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedAccomPanel.setVisible(false);
				reservedFlightPanel.setVisible(true);
			}
		});
		// 다움
		reservedAccomPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedAccomPanel.getGoDay();
				reservedAccomPanel.getBackDay();
				reservedAccomPanel.getContPerson();
				reservedAccomPanel.getHotel();

				AccDto dto = new AccDto();
				dto.setCheckin(reservedAccomPanel.getGoDay());
				dto.setCheckout(reservedAccomPanel.getBackDay());
				dto.setPeople(reservedAccomPanel.getContPerson());
				dto.setHG(reservedAccomPanel.getHotel());

				List<AccDto> list = as.accSearch(dto);

				if (list != null) {
					AccomSearch dialog = new AccomSearch(frame, "숙소조회");
					dialog.set(list);
					int no = dialog.run();

					if (no > 0) {
						dto.setRoomno(no);
						dto.setPrice(Integer.parseInt(dialog.getPrice()));

						voBox.setA(dto);
						// 성공
						reservedAccomPanel.setVisible(false);
						reservedCarPanel.reset();
						reservedCarPanel.setVisible(true);
						return;
					}
				}

				PopUpDialog dialog = new PopUpDialog(frame, "조회", "조회 실패! 내용을 확인해 주세요");
				dialog.run();
			}
		});

		/** 예약페이지 비행기 **/
		frame.getContentPane().add(reservedFlightPanel);
		reservedFlightPanel.setVisible(false);

		reservedFlightPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedFlightPanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});

		reservedFlightPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reservedFlightPanel.setVisible(false);
//				reservedPanel.setVisible(true);
				faveratePanel.reset();
				faveratePanel.setVisible(true);
			}
		});

		reservedFlightPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Flight_Vo vo = new Flight_Vo();
				vo.setDepartureDate(reservedFlightPanel.getGoDay());
				vo.setDepAirport(reservedFlightPanel.getComboBox());
				vo.setFlightPerson(Integer.toString(reservedFlightPanel.getContPerson()));
				vo.setFlightPrice(Integer.toString(reservedFlightPanel.getMaxMoney()));

				FlightSearch dialog = new FlightSearch(frame, "비행기 조회", "");

				List<Flight_Vo> list = fs.reservation(vo, 2);
				vo.setDepAirport("제주공항");
				vo.setDepartureDate(reservedFlightPanel.getBackDay());
				List<Flight_Vo> list2 = fs.reservation(vo, 1);

				if (list != null && list2 != null) {

					dialog.set(list, dialog.getTable());
					dialog.set(list2, dialog.getTable2());
					Flight_Vo_MyFlight myVo = dialog.run();

					System.out.println(myVo);
					
					if (myVo.getMyDepartureFlightNo() != null && myVo.getMyReturnFlightNo() != null) {
						System.out.println("test");
						List<Flight_Vo> list3 = fs.myReservation(myVo);

						if (list3 != null) {
							voBox.setF(list3);
							reservedFlightPanel.setVisible(false);
							reservedAccomPanel.reset();
							reservedAccomPanel.setVisible(true);
							return;
						}
					}
				}
				PopUpDialog dialog2 = new PopUpDialog(frame, "조회", "조회 실패! 내용을 확인해 주세요");
				dialog2.run();
			}
		});

//		/** 예약페이지 1 **/
//		frame.getContentPane().add(reservedPanel);
//		reservedPanel.setVisible(false);
//
//		// 뒤로가기
//		reservedPanel.getBackBtn().addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				reservedPanel.setVisible(false);
//				faveratePanel.setVisible(true);
//			}
//		});
//		// 홈으로
//		reservedPanel.getHomeBtn().addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				reservedPanel.setVisible(false);
//				mainPanel.setVisible(true);
//			}
//		});
//		// 일반예약
//		reservedPanel.getNomalBtn().addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				reservedPanel.setVisible(false);
//				reservedFlightPanel.reset();
//				reservedFlightPanel.setVisible(true);
//
//			}
//		});
//		// 패키지 예약
//		reservedPanel.getPackBtn().addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//			}
//		});

		/** 설문페이지 **/
		frame.getContentPane().add(faveratePanel);
		faveratePanel.setVisible(false);
		// 뒤로가기
		faveratePanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				faveratePanel.setVisible(false);
				mainPanel.setVisible(true);

			}
		});
		// 홈으로
		faveratePanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				faveratePanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		// 예약하기
		faveratePanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				SurveyVo vo = new SurveyVo();

				String[] arr = faveratePanel.getQ2();

				if (faveratePanel.getQ5() != null && faveratePanel.getQ5().equals("있다")) {
					vo.setAnimal_yn("Y");
				} else {
					vo.setAnimal_yn("N");
				}
				if (faveratePanel.getQ3() != null && faveratePanel.getQ3().equals("너무무겁다")) {
					vo.setBudget("Y");
				} else if (faveratePanel.getQ3() != null && faveratePanel.getQ3().equals("모르겠다")) {
					vo.setBudget("S");
				} else {
					vo.setBudget("N");
				}

				vo.setPurpose(arr[0]);
				vo.setPurpose2(arr[1]);
				vo.setLocation(faveratePanel.getQ1());
				vo.setGroup(faveratePanel.getQ4());

				System.out.println(vo);
				System.out.println(Main.loginNo);

				if (ss.survey(vo)) {
					faveratePanel.setVisible(false);
					reservedFlightPanel.reset();
					reservedFlightPanel.setVisible(true);
//					reservedPanel.setVisible(true);
				} else {
					PopUpDialog dialog = new PopUpDialog(frame, "설문조사", "다시 확인해주시기 바랍니다.");
					dialog.run();
				}

			}
		});
		/** 엑티비티 여행정보 **/
		frame.getContentPane().add(inforActiv);
		inforActiv.setVisible(false);

		// 뒤로가기
		inforActiv.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inforActiv.setVisible(false);
				mainPanel.setVisible(true);

			}
		});
		// 홈으로
		inforActiv.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inforActiv.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		inforActiv.getTripBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TravelDao td = new TravelDao();
				List<TravelVo> list = td.attraction(1);

				if (list == null) {
					return;
				}
				inforActiv.setVisible(false);
				inforTrip.setList(list);
				inforTrip.setVisible(true);

			}
		});
		inforActiv.getRestraBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TravelDao td = new TravelDao();
				List<TravelVo> list = new ArrayList<TravelVo>();
				list.addAll(td.attraction(2));
				list.addAll(td.attraction(4));

				inforActiv.setVisible(false);
				inforRestar.setList(list);
				inforRestar.setVisible(true);

			}
		});

		/** 맛집/카페 여행정보 **/
		frame.getContentPane().add(inforRestar);
		inforRestar.setVisible(false);

		// 뒤로가기
		inforRestar.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inforRestar.setVisible(false);
				mainPanel.setVisible(true);

			}
		});
		// 홈으로
		inforRestar.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inforRestar.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		inforRestar.getActivBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TravelDao td = new TravelDao();
				List<TravelVo> list = td.attraction(3);

				if (list == null) {
					return;
				}
				inforRestar.setVisible(false);
				inforActiv.setList(list);
				inforActiv.setVisible(true);

			}
		});
		inforRestar.getTripBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TravelDao td = new TravelDao();
				List<TravelVo> list = td.attraction(1);

				if (list == null) {
					return;
				}
				inforRestar.setVisible(false);
				inforTrip.setList(list);
				inforTrip.setVisible(true);

			}
		});

		/** 관광지 여행정보 **/
		frame.getContentPane().add(inforTrip);
		inforTrip.setVisible(false);

		// 뒤로가기
		inforTrip.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inforTrip.setVisible(false);
				mainPanel.setVisible(true);

			}
		});
		// 홈으로
		inforTrip.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inforTrip.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		inforTrip.getActivBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TravelDao td = new TravelDao();
				List<TravelVo> list = td.attraction(3);

				if (list == null) {
					return;
				}
				inforTrip.setVisible(false);
				inforActiv.setList(list);
				inforActiv.setVisible(true);

			}
		});
		inforTrip.getRestraBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TravelDao td = new TravelDao();
				List<TravelVo> list = new ArrayList<TravelVo>();
				list.addAll(td.attraction(2));
				list.addAll(td.attraction(4));

				inforTrip.setVisible(false);
				inforRestar.setList(list);
				inforRestar.setVisible(true);

			}
		});

		/** 메인페이지 **/
		frame.getContentPane().add(mainPanel);
		mainPanel.setVisible(false);

		// 예약하기 페이지 이동
		mainPanel.getGotoReserveBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				faveratePanel.reset();
				faveratePanel.setVisible(true);

			}
		});
		// 여행정보 이동
		mainPanel.getGotoInfoBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				TravelDao td = new TravelDao();
				List<TravelVo> list = td.attraction(1);

				if (list == null) {
					return;
				}
				mainPanel.setVisible(false);
				inforTrip.setList(list);
				inforTrip.setVisible(true);

			}
		});
		// 마이페이지 이동
		mainPanel.getGotoMyPageBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				myPagePanel.setVisible(true);

			}
		});
		// 고객센터 이동
		mainPanel.getGotoServiceBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.setVisible(false);
				servicePanel.setVisible(true);

			}
		});
		// 로그아웃
		mainPanel.getLogoutBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.loginNo = 0;
				mainPanel.setVisible(false);
				loginPanel.reset();
				loginPanel.setVisible(true);

			}
		});

		/** 회원가입페이지 **/
		frame.getContentPane().add(joinPanel);
		joinPanel.setVisible(false);

		// 아이디중복확인
		joinPanel.getCheckIdBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (ms.checkId(joinPanel.getId())) {

					if (ms.checkDubleId(joinPanel.getId())) {
						PopUpDialog dialog = new PopUpDialog(frame, "아이디 중복확인", "생성가능한 아이디 입니다.");
						dialog.run();
						joinPanel.getTextFieldId().setEnabled(false);
						joinPanel.getCheckIdBtn().setSelected(true);
					} else {
						PopUpDialog dialog = new PopUpDialog(frame, "아이디 중복확인", "사용 불가능한 아이디 입니다.");
						dialog.run();
						joinPanel.getCheckIdBtn().setSelected(false);
					}

				} else {
					PopUpDialog dialog = new PopUpDialog(frame, "아이디 중복확인", "형식을 맞춰주시기 바랍니다.");
					dialog.run();
					joinPanel.getCheckIdBtn().setSelected(false);
				}
			}
		});
		// 비밀확인
		joinPanel.getCheckPwdBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (ms.checkPwd(joinPanel.getPwd())) {
					TextFieldDialog dialog = new TextFieldDialog(frame, "비밀번호 확인", "한번 더 입력해주세요");

					if (joinPanel.getPwd().equals(dialog.run())) {
						PopUpDialog dialog2 = new PopUpDialog(frame, "비밀번호 확인", "확인되었습니다.");
						dialog2.run();
						joinPanel.getTextFieldPwd().setEnabled(false);
						joinPanel.getCheckPwdBtn().setSelected(true);
					} else {
						PopUpDialog dialog2 = new PopUpDialog(frame, "비밀번호 확인", "비밀번호가 동일하지 않습니다.");
						dialog2.run();
						joinPanel.getCheckPwdBtn().setSelected(false);
					}

				} else {
					PopUpDialog dialog2 = new PopUpDialog(frame, "비밀번호 확인", "비밀번호는 4자리 이상입니다.");
					dialog2.run();
					joinPanel.getCheckPwdBtn().setSelected(false);
				}
			}
		});
		// 뒤로가기
		joinPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginPanel.reset();
				loginPanel.setVisible(true);
				joinPanel.setVisible(false);
			}
		});
		// 홈으로
		joinPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginPanel.reset();
				loginPanel.setVisible(true);
				joinPanel.setVisible(false);
			}
		});
		// 회원가입
		joinPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (joinPanel.getCheckIdBtn().isSelected() && joinPanel.getCheckPwdBtn().isSelected()) {

					MemberVo vo = new MemberVo();
					vo.setEmail(joinPanel.getTextFieldEmail());
					vo.setId(joinPanel.getId());
					vo.setMemberName(joinPanel.getTextFieldName());
					vo.setMemberNick(joinPanel.getTextFieldNick());
					vo.setPhone(joinPanel.getTextFieldPhone());
					vo.setPwd(joinPanel.getPwd());

					if (ms.join(vo)) {
						PopUpDialog dialog = new PopUpDialog(frame, "회원가입", "회원가입 성공! 환영합니다.");
						dialog.run();
						loginPanel.reset();
						loginPanel.setVisible(true);
						joinPanel.setVisible(false);
					} else {
						PopUpDialog dialog = new PopUpDialog(frame, "회원가입", "회원가입 실패.. 다시 시도해주세요.");
						dialog.run();
					}

				} else {
					PopUpDialog dialog = new PopUpDialog(frame, "회원가입", "아이디, 비밀번호 및 필수항목을 체크해주세요.");
					dialog.run();
				}
			}
		});

		/** 아이디찾기페이지 **/
		frame.getContentPane().add(findIdPanel);
		findIdPanel.setVisible(false);
		// 뒤로가기
		findIdPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginPanel.reset();
				loginPanel.setVisible(true);
				findIdPanel.setVisible(false);
			}
		});
		// 홈
		findIdPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginPanel.reset();
				loginPanel.setVisible(true);
				findIdPanel.setVisible(false);
			}
		});
		// 아이디 찾기
		findIdPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MemberVo vo = new MemberVo();
				vo.setEmail(findIdPanel.getTextFieldEmail());
				vo.setMemberName(findIdPanel.getTextFieldName());

				String id = ms.findId(vo);

				if (id != null) {
					PopUpDialog dialog = new PopUpDialog(frame, "아이디 찾기", "아이디는 " + id + " 입니다.");
					dialog.run();
					loginPanel.reset();
					loginPanel.setVisible(true);
					findIdPanel.setVisible(false);
				} else {
					PopUpDialog dialog = new PopUpDialog(frame, "아이디 찾기", "입력하신 정보가 없습니다.");
					dialog.run();
				}
			}
		});

		/** 비밀번호찾기페이지 **/
		frame.getContentPane().add(findPwdPanel);
		findPwdPanel.setVisible(false);
		// 뒤로가기
		findPwdPanel.getBackBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginPanel.reset();
				loginPanel.setVisible(true);
				findPwdPanel.setVisible(false);

			}
		});
		// 홈
		findPwdPanel.getHomeBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginPanel.reset();
				loginPanel.setVisible(true);
				findPwdPanel.setVisible(false);

			}
		});
		// 비밀번호 찾기
		findPwdPanel.getNextBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MemberVo vo = new MemberVo();
				vo.setId(findPwdPanel.getTextFieldId());
				vo.setEmail(findPwdPanel.getTextFieldEmail());
				vo.setMemberName(findPwdPanel.getTextFieldName());
				System.out.println(vo);
				String pwd = ms.findPwd(vo);

				if (pwd != null) {
					PopUpDialog dialog = new PopUpDialog(frame, "비밀번호 찾기", "비밀번호는 " + pwd + " 입니다.");
					dialog.run();
					loginPanel.reset();
					loginPanel.setVisible(true);
					findPwdPanel.setVisible(false);
				} else {
					PopUpDialog dialog = new PopUpDialog(frame, "비밀번호 찾기", "입력하신 정보가 없습니다.");
					dialog.run();
				}
			}
		});

		/** 로그인페이지 **/
		frame.getContentPane().add(loginPanel);
		loginPanel.setVisible(true);

		// 로그인 버튼
		loginPanel.getLoginBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MemberVo vo = new MemberVo();
				vo.setId(loginPanel.getIdTextField());
				vo.setPwd(loginPanel.getPasswordField());

				if (ms.login(vo)) {
					PopUpDialog dialog = new PopUpDialog(frame, "로그인성공", "로그인 되었습니다.");
					dialog.run();
					mainPanel.setVisible(true);
					loginPanel.setVisible(false);
				} else {
					PopUpDialog dialog = new PopUpDialog(frame, "로그인실패", "아이디, 비밀번호를 확인하십시오.");
					dialog.run();
				}

			}
		});
		// 아이디 찾기
		loginPanel.getFindIdBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				findIdPanel.reset();
				findIdPanel.setVisible(true);
				loginPanel.setVisible(false);
			}
		});
		// 패스워드 찾기
		loginPanel.getFindPwdBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				findPwdPanel.reset();
				findPwdPanel.setVisible(true);
				loginPanel.setVisible(false);
			}
		});
		// 회원가입
		loginPanel.getJoinBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				joinPanel.reset();
				joinPanel.setVisible(true);
				loginPanel.setVisible(false);
			}
		});

		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
