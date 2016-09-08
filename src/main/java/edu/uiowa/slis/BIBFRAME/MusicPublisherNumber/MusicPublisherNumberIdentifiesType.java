package edu.uiowa.slis.BIBFRAME.MusicPublisherNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MusicPublisherNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MusicPublisherNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MusicPublisherNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MusicPublisherNumberIdentifiesIterator theMusicPublisherNumberIdentifiesIterator = (MusicPublisherNumberIdentifiesIterator)findAncestorWithClass(this, MusicPublisherNumberIdentifiesIterator.class);
			pageContext.getOut().print(theMusicPublisherNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPublisherNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPublisherNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

