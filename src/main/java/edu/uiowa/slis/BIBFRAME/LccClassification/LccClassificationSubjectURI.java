package edu.uiowa.slis.BIBFRAME.LccClassification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccClassificationSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccClassificationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LccClassificationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LccClassification theLccClassification = (LccClassification)findAncestorWithClass(this, LccClassification.class);
			if (!theLccClassification.commitNeeded) {
				pageContext.getOut().print(theLccClassification.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LccClassification theLccClassification = (LccClassification)findAncestorWithClass(this, LccClassification.class);
			return theLccClassification.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LccClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LccClassification theLccClassification = (LccClassification)findAncestorWithClass(this, LccClassification.class);
			theLccClassification.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LccClassification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccClassification for subjectURI tag ");
		}
	}
}

