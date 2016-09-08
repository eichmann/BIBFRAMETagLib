package edu.uiowa.slis.BIBFRAME.MusicPublisherNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MusicPublisherNumberIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MusicPublisherNumberIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(MusicPublisherNumberIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MusicPublisherNumberIdentifiesIterator theMusicPublisherNumberIdentifiesIterator = (MusicPublisherNumberIdentifiesIterator)findAncestorWithClass(this, MusicPublisherNumberIdentifiesIterator.class);
			pageContext.getOut().print(theMusicPublisherNumberIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPublisherNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPublisherNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

