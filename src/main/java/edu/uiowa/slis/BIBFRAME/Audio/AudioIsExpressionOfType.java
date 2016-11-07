package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioIsExpressionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioIsExpressionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioIsExpressionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioIsExpressionOfIterator theAudioIsExpressionOfIterator = (AudioIsExpressionOfIterator)findAncestorWithClass(this, AudioIsExpressionOfIterator.class);
			pageContext.getOut().print(theAudioIsExpressionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}
