package edu.uiowa.slis.BIBFRAME.TranslatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslatedTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TranslatedTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslatedTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TranslatedTitle theTranslatedTitle = (TranslatedTitle)findAncestorWithClass(this, TranslatedTitle.class);
			if (!theTranslatedTitle.commitNeeded) {
				pageContext.getOut().print(theTranslatedTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TranslatedTitle theTranslatedTitle = (TranslatedTitle)findAncestorWithClass(this, TranslatedTitle.class);
			return theTranslatedTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TranslatedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TranslatedTitle theTranslatedTitle = (TranslatedTitle)findAncestorWithClass(this, TranslatedTitle.class);
			theTranslatedTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for label tag ");
		}
	}
}

