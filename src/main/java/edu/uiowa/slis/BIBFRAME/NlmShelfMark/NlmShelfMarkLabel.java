package edu.uiowa.slis.BIBFRAME.NlmShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NlmShelfMarkLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NlmShelfMarkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NlmShelfMarkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NlmShelfMark theNlmShelfMark = (NlmShelfMark)findAncestorWithClass(this, NlmShelfMark.class);
			if (!theNlmShelfMark.commitNeeded) {
				pageContext.getOut().print(theNlmShelfMark.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NlmShelfMark theNlmShelfMark = (NlmShelfMark)findAncestorWithClass(this, NlmShelfMark.class);
			return theNlmShelfMark.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NlmShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NlmShelfMark theNlmShelfMark = (NlmShelfMark)findAncestorWithClass(this, NlmShelfMark.class);
			theNlmShelfMark.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NlmShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NlmShelfMark for label tag ");
		}
	}
}

