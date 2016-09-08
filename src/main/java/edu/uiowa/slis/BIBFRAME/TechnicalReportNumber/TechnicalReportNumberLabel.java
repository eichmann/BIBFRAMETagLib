package edu.uiowa.slis.BIBFRAME.TechnicalReportNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TechnicalReportNumberLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TechnicalReportNumberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TechnicalReportNumberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TechnicalReportNumber theTechnicalReportNumber = (TechnicalReportNumber)findAncestorWithClass(this, TechnicalReportNumber.class);
			if (!theTechnicalReportNumber.commitNeeded) {
				pageContext.getOut().print(theTechnicalReportNumber.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TechnicalReportNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TechnicalReportNumber for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TechnicalReportNumber theTechnicalReportNumber = (TechnicalReportNumber)findAncestorWithClass(this, TechnicalReportNumber.class);
			return theTechnicalReportNumber.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TechnicalReportNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TechnicalReportNumber for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TechnicalReportNumber theTechnicalReportNumber = (TechnicalReportNumber)findAncestorWithClass(this, TechnicalReportNumber.class);
			theTechnicalReportNumber.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TechnicalReportNumber for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TechnicalReportNumber for label tag ");
		}
	}
}

