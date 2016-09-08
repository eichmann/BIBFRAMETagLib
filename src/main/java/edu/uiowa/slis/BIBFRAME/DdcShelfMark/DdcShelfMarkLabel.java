package edu.uiowa.slis.BIBFRAME.DdcShelfMark;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DdcShelfMarkLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DdcShelfMarkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DdcShelfMarkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DdcShelfMark theDdcShelfMark = (DdcShelfMark)findAncestorWithClass(this, DdcShelfMark.class);
			if (!theDdcShelfMark.commitNeeded) {
				pageContext.getOut().print(theDdcShelfMark.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DdcShelfMark theDdcShelfMark = (DdcShelfMark)findAncestorWithClass(this, DdcShelfMark.class);
			return theDdcShelfMark.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DdcShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DdcShelfMark theDdcShelfMark = (DdcShelfMark)findAncestorWithClass(this, DdcShelfMark.class);
			theDdcShelfMark.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DdcShelfMark for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DdcShelfMark for label tag ");
		}
	}
}

