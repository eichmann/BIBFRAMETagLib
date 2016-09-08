package edu.uiowa.slis.BIBFRAME.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PeriodicalSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			if (!thePeriodical.commitNeeded) {
				pageContext.getOut().print(thePeriodical.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			return thePeriodical.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Periodical for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Periodical thePeriodical = (Periodical)findAncestorWithClass(this, Periodical.class);
			thePeriodical.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for subjectURI tag ");
		}
	}
}

