package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SpineTitle theSpineTitle = (SpineTitle)findAncestorWithClass(this, SpineTitle.class);
			if (!theSpineTitle.commitNeeded) {
				pageContext.getOut().print(theSpineTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			SpineTitle theSpineTitle = (SpineTitle)findAncestorWithClass(this, SpineTitle.class);
			return theSpineTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing SpineTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			SpineTitle theSpineTitle = (SpineTitle)findAncestorWithClass(this, SpineTitle.class);
			theSpineTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for label tag ");
		}
	}
}

