package edu.uiowa.slis.BIBFRAME.Strn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StrnLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StrnLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StrnLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Strn theStrn = (Strn)findAncestorWithClass(this, Strn.class);
			if (!theStrn.commitNeeded) {
				pageContext.getOut().print(theStrn.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Strn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Strn for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Strn theStrn = (Strn)findAncestorWithClass(this, Strn.class);
			return theStrn.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Strn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Strn for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Strn theStrn = (Strn)findAncestorWithClass(this, Strn.class);
			theStrn.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Strn for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Strn for label tag ");
		}
	}
}

