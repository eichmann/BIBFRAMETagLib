package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaAgentInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaAgentInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaAgentInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaAgentInverseIterator theMultimediaAgentInverseIterator = (MultimediaAgentInverseIterator)findAncestorWithClass(this, MultimediaAgentInverseIterator.class);
			pageContext.getOut().print(theMultimediaAgentInverseIterator.getAgentInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for agent tag ");
		}
		return SKIP_BODY;
	}
}

