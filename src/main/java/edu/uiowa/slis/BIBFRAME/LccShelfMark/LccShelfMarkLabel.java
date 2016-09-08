package edu.uiowa.slis.BIBFRAME.LccShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LccShelfMarkLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static LccShelfMarkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LccShelfMarkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LccShelfMark theLccShelfMark = (LccShelfMark)findAncestorWithClass(this, LccShelfMark.class);
			if (!theLccShelfMark.commitNeeded) {
				pageContext.getOut().print(theLccShelfMark.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LccShelfMark theLccShelfMark = (LccShelfMark)findAncestorWithClass(this, LccShelfMark.class);
			return theLccShelfMark.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LccShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LccShelfMark theLccShelfMark = (LccShelfMark)findAncestorWithClass(this, LccShelfMark.class);
			theLccShelfMark.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LccShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LccShelfMark for label tag ");
		}
	}
}

