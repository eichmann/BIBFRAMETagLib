package edu.uiowa.slis.BIBFRAME.LinguisticSystem;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LinguisticSystemSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LinguisticSystemSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LinguisticSystemSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LinguisticSystem theLinguisticSystem = (LinguisticSystem)findAncestorWithClass(this, LinguisticSystem.class);
			if (!theLinguisticSystem.commitNeeded) {
				pageContext.getOut().print(theLinguisticSystem.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LinguisticSystem for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LinguisticSystem for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LinguisticSystem theLinguisticSystem = (LinguisticSystem)findAncestorWithClass(this, LinguisticSystem.class);
			return theLinguisticSystem.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LinguisticSystem for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LinguisticSystem for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LinguisticSystem theLinguisticSystem = (LinguisticSystem)findAncestorWithClass(this, LinguisticSystem.class);
			theLinguisticSystem.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LinguisticSystem for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LinguisticSystem for subjectURI tag ");
		}
	}
}

