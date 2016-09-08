package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitle theTransliteratedTitle = (TransliteratedTitle)findAncestorWithClass(this, TransliteratedTitle.class);
			if (!theTransliteratedTitle.commitNeeded) {
				pageContext.getOut().print(theTransliteratedTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TransliteratedTitle theTransliteratedTitle = (TransliteratedTitle)findAncestorWithClass(this, TransliteratedTitle.class);
			return theTransliteratedTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TransliteratedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TransliteratedTitle theTransliteratedTitle = (TransliteratedTitle)findAncestorWithClass(this, TransliteratedTitle.class);
			theTransliteratedTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for label tag ");
		}
	}
}

