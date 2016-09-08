package edu.uiowa.slis.BIBFRAME.ConciseTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConciseTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConciseTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConciseTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConciseTitle theConciseTitle = (ConciseTitle)findAncestorWithClass(this, ConciseTitle.class);
			if (!theConciseTitle.commitNeeded) {
				pageContext.getOut().print(theConciseTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ConciseTitle theConciseTitle = (ConciseTitle)findAncestorWithClass(this, ConciseTitle.class);
			return theConciseTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConciseTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ConciseTitle theConciseTitle = (ConciseTitle)findAncestorWithClass(this, ConciseTitle.class);
			theConciseTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for label tag ");
		}
	}
}

