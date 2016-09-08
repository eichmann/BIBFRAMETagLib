package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasInstanceIterator theMultimediaHasInstanceIterator = (MultimediaHasInstanceIterator)findAncestorWithClass(this, MultimediaHasInstanceIterator.class);
			pageContext.getOut().print(theMultimediaHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

