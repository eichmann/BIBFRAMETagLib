package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasTitleIterator theMultimediaHasTitleIterator = (MultimediaHasTitleIterator)findAncestorWithClass(this, MultimediaHasTitleIterator.class);
			pageContext.getOut().print(theMultimediaHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

