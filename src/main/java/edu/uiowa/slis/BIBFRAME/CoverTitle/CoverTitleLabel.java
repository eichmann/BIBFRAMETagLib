package edu.uiowa.slis.BIBFRAME.CoverTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoverTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CoverTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CoverTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoverTitle theCoverTitle = (CoverTitle)findAncestorWithClass(this, CoverTitle.class);
			if (!theCoverTitle.commitNeeded) {
				pageContext.getOut().print(theCoverTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CoverTitle theCoverTitle = (CoverTitle)findAncestorWithClass(this, CoverTitle.class);
			return theCoverTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoverTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CoverTitle theCoverTitle = (CoverTitle)findAncestorWithClass(this, CoverTitle.class);
			theCoverTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CoverTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoverTitle for label tag ");
		}
	}
}

