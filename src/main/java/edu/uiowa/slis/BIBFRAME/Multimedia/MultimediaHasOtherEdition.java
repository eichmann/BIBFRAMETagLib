package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasOtherEditionIterator theMultimediaHasOtherEditionIterator = (MultimediaHasOtherEditionIterator)findAncestorWithClass(this, MultimediaHasOtherEditionIterator.class);
			pageContext.getOut().print(theMultimediaHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

