package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicAgentInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicAgentInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicAgentInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicAgentInverseIterator theNotatedMusicAgentInverseIterator = (NotatedMusicAgentInverseIterator)findAncestorWithClass(this, NotatedMusicAgentInverseIterator.class);
			pageContext.getOut().print(theNotatedMusicAgentInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for agent tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for agent tag ");
		}
		return SKIP_BODY;
	}
}

