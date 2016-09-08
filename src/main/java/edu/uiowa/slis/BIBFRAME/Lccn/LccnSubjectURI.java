package edu.uiowa.slis.BIBFRAME.Lccn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccnSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccnSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LccnSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Lccn theLccn = (Lccn)findAncestorWithClass(this, Lccn.class);
			if (!theLccn.commitNeeded) {
				pageContext.getOut().print(theLccn.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Lccn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lccn for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Lccn theLccn = (Lccn)findAncestorWithClass(this, Lccn.class);
			return theLccn.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Lccn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lccn for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Lccn theLccn = (Lccn)findAncestorWithClass(this, Lccn.class);
			theLccn.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Lccn for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Lccn for subjectURI tag ");
		}
	}
}

