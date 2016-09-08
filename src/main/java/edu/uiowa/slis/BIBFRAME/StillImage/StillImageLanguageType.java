package edu.uiowa.slis.BIBFRAME.StillImage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StillImageLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StillImageLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(StillImageLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StillImageLanguageIterator theStillImageLanguageIterator = (StillImageLanguageIterator)findAncestorWithClass(this, StillImageLanguageIterator.class);
			pageContext.getOut().print(theStillImageLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StillImage for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing StillImage for language tag ");
		}
		return SKIP_BODY;
	}
}

