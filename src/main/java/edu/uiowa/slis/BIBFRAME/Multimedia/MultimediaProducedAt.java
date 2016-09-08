package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaProducedAtIterator theMultimediaProducedAtIterator = (MultimediaProducedAtIterator)findAncestorWithClass(this, MultimediaProducedAtIterator.class);
			pageContext.getOut().print(theMultimediaProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

