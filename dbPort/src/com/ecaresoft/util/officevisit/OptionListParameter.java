package com.ecaresoft.util.officevisit;

import java.util.Arrays;
import java.util.List;

/**
 * @author odelarosa
 *
 */
public class OptionListParameter extends AReportParameter {

	private String answer;
	private int selectionId;

	/**
	 * @param id
	 * @param name
	 */
	public OptionListParameter(int id, String name) {
		super(id, name);

		setType(OPTION);
	}

	public String getAnswer() {
		return answer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ecaresoft.util.officevisit.AReportParameter#getParams()
	 */
	@Override
	public List<Object> getParams() {
		return Arrays.asList((Object) selectionId, getId());
	}

	public int getSelectionId() {
		return selectionId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ecaresoft.util.officevisit.AReportParameter#getSql()
	 */
	@Override
	public String getSql() {
		return " AND res.EXME_Pregunta_Lista_ID = ? AND res.exme_pregunta_id = ? ";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ecaresoft.util.officevisit.AReportParameter#getStrValue()
	 */
	@Override
	public String getStrValue() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setSelectionId(int selectionId) {
		this.selectionId = selectionId;
	}

	@Override
	public String toString() {
		return getName() + " - " + answer;
	}

}
