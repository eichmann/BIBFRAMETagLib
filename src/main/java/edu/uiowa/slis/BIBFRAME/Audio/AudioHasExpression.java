package edu.uiowa.slis.BIBFRAME.Audio;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AudioHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioHasExpressionIterator theAudioHasExpressionIterator = (AudioHasExpressionIterator)findAncestorWithClass(this, AudioHasExpressionIterator.class);
			pageContext.getOut().print(theAudioHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Audio for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Audio for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

