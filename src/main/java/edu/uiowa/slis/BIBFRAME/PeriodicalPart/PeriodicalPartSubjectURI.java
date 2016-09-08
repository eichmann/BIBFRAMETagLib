package edu.uiowa.slis.BIBFRAME.PeriodicalPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalPartSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalPartSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalPartSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalPart thePeriodicalPart = (PeriodicalPart)findAncestorWithClass(this, PeriodicalPart.class);
			if (!thePeriodicalPart.commitNeeded) {
				pageContext.getOut().print(thePeriodicalPart.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PeriodicalPart thePeriodicalPart = (PeriodicalPart)findAncestorWithClass(this, PeriodicalPart.class);
			return thePeriodicalPart.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PeriodicalPart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PeriodicalPart thePeriodicalPart = (PeriodicalPart)findAncestorWithClass(this, PeriodicalPart.class);
			thePeriodicalPart.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PeriodicalPart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeriodicalPart for subjectURI tag ");
		}
	}
}

