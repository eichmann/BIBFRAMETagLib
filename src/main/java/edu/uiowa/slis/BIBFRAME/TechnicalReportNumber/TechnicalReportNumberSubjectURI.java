package edu.uiowa.slis.BIBFRAME.TechnicalReportNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TechnicalReportNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TechnicalReportNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TechnicalReportNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TechnicalReportNumber theTechnicalReportNumber = (TechnicalReportNumber)findAncestorWithClass(this, TechnicalReportNumber.class);
			if (!theTechnicalReportNumber.commitNeeded) {
				pageContext.getOut().print(theTechnicalReportNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TechnicalReportNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TechnicalReportNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TechnicalReportNumber theTechnicalReportNumber = (TechnicalReportNumber)findAncestorWithClass(this, TechnicalReportNumber.class);
			return theTechnicalReportNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TechnicalReportNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TechnicalReportNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TechnicalReportNumber theTechnicalReportNumber = (TechnicalReportNumber)findAncestorWithClass(this, TechnicalReportNumber.class);
			theTechnicalReportNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TechnicalReportNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TechnicalReportNumber for subjectURI tag ");
		}
	}
}

