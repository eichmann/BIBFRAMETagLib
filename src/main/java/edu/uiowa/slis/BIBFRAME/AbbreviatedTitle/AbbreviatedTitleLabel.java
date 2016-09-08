package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitle theAbbreviatedTitle = (AbbreviatedTitle)findAncestorWithClass(this, AbbreviatedTitle.class);
			if (!theAbbreviatedTitle.commitNeeded) {
				pageContext.getOut().print(theAbbreviatedTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AbbreviatedTitle theAbbreviatedTitle = (AbbreviatedTitle)findAncestorWithClass(this, AbbreviatedTitle.class);
			return theAbbreviatedTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AbbreviatedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AbbreviatedTitle theAbbreviatedTitle = (AbbreviatedTitle)findAncestorWithClass(this, AbbreviatedTitle.class);
			theAbbreviatedTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for label tag ");
		}
	}
}

