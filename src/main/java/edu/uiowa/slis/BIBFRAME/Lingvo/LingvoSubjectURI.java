package edu.uiowa.slis.BIBFRAME.Lingvo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LingvoSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LingvoSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LingvoSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Lingvo theLingvo = (Lingvo)findAncestorWithClass(this, Lingvo.class);
			if (!theLingvo.commitNeeded) {
				pageContext.getOut().print(theLingvo.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Lingvo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lingvo for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Lingvo theLingvo = (Lingvo)findAncestorWithClass(this, Lingvo.class);
			return theLingvo.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Lingvo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lingvo for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Lingvo theLingvo = (Lingvo)findAncestorWithClass(this, Lingvo.class);
			theLingvo.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Lingvo for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lingvo for subjectURI tag ");
		}
	}
}

