package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSupersedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSupersedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSupersedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSupersedesIterator theMultimediaSupersedesIterator = (MultimediaSupersedesIterator)findAncestorWithClass(this, MultimediaSupersedesIterator.class);
			pageContext.getOut().print(theMultimediaSupersedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

