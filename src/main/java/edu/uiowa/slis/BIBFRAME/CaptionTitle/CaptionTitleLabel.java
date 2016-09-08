package edu.uiowa.slis.BIBFRAME.CaptionTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaptionTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CaptionTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CaptionTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CaptionTitle theCaptionTitle = (CaptionTitle)findAncestorWithClass(this, CaptionTitle.class);
			if (!theCaptionTitle.commitNeeded) {
				pageContext.getOut().print(theCaptionTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CaptionTitle theCaptionTitle = (CaptionTitle)findAncestorWithClass(this, CaptionTitle.class);
			return theCaptionTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CaptionTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CaptionTitle theCaptionTitle = (CaptionTitle)findAncestorWithClass(this, CaptionTitle.class);
			theCaptionTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CaptionTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaptionTitle for label tag ");
		}
	}
}

