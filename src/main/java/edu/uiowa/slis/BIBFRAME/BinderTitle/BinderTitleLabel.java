package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BinderTitle theBinderTitle = (BinderTitle)findAncestorWithClass(this, BinderTitle.class);
			if (!theBinderTitle.commitNeeded) {
				pageContext.getOut().print(theBinderTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			BinderTitle theBinderTitle = (BinderTitle)findAncestorWithClass(this, BinderTitle.class);
			return theBinderTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing BinderTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			BinderTitle theBinderTitle = (BinderTitle)findAncestorWithClass(this, BinderTitle.class);
			theBinderTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for label tag ");
		}
	}
}

