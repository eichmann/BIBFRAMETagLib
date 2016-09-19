package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasPreferredTitleIterator theMultimediaHasPreferredTitleIterator = (MultimediaHasPreferredTitleIterator)findAncestorWithClass(this, MultimediaHasPreferredTitleIterator.class);
			pageContext.getOut().print(theMultimediaHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

