package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicHasDerivativeIterator theNotatedMusicHasDerivativeIterator = (NotatedMusicHasDerivativeIterator)findAncestorWithClass(this, NotatedMusicHasDerivativeIterator.class);
			pageContext.getOut().print(theNotatedMusicHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}
